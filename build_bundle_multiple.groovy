// globals ==================================================================
def PS = System.getProperty("file.separator")

// param parsing ============================================================
def cli = new CliBuilder(usage: 'build_bundle.groovy -wp profiles -pid pidfile -n count')
cli.with {
   wp  longOpt: 'with profiles',       args:1, required:true,  'Text file with profile URIs, one per line'
   pid longOpt: 'patient identifiers', args:1, required:false, 'Text file with patient identifiers, one per line, optional'
   n   longOpt: 'bundle count',        args:1, required:false, type: int, 'Number of bundles to be generated (default is 10)'
}
def options = cli.parse(args)
if (!options) {
   return
}

def wp = options.wp
def pid = options.pid
def n = options.n ?: 10

def command = "groovy build_bundle.groovy -wp ${wp}"

if (pid) command += " -pid ${pid}"

n.times {
   Process child = Runtime.getRuntime().exec(command)
   InputStream in1 = child.getInputStream()
   def out = in1.text
   in1.close()
   child.waitFor()
   def path = "output"+ PS +"bundle_"+ it +".json"
   def file = new File(path)
   file << out
   println "Bundle saved in ${path}"
}
