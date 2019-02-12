// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Documents/sdev/sdev-ca1/sdev-ca1/conf/routes
// @DATE:Tue Feb 12 14:27:16 GMT 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
