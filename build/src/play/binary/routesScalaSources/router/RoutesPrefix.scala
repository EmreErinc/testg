// @GENERATOR:play-routes-compiler
// @SOURCE:/home/emre/testg/conf/routes
// @DATE:Sun Oct 07 00:12:54 EET 2018


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
