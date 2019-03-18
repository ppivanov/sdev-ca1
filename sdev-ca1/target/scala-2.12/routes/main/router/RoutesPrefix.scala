// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Computing/sdev-ca1/sdev-ca1/sdev-ca1/conf/routes
// @DATE:Mon Mar 18 20:40:47 GMT 2019


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
