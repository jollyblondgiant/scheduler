(ns server.main
  (:require [ring.adapter.jetty :refer [run-jetty]]
            [ring.middleware.reload :refer [wrap-reload]]
            [server.routes :refer [app-routes]]))


(defn -main 
  [port]
  (-> app-routes 
      (run-jetty {:port (Integer. port)})))

(defn -dev-main
  [port]
  (-> (wrap-reload #'app-routes)
      (run-jetty {:port (Integer. port)})))