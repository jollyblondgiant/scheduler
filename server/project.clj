(defproject server "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 ;;
                 [ring "1.10.0"]
                 [compojure "1.7.0"]
                 [metosin/reitit "0.7.0-alpha4"]

                 [cheshire "5.11.0"]


                 [http-kit "2.7.0-beta3"]

                 [datascript "1.4.2"]

                 [prismatic/schema "1.4.1"]

                 [clj-time "0.15.2"]]
  :main server.main
  :profiles {:dev 
             {:main server.main/-dev-main}}
  :repl-options {:init-ns server.core})
