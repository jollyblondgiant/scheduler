(ns server.routes
  (:require
   [compojure.core :refer [defroutes GET]]
   [compojure.route :refer [not-found]]
   ;;[reitit.ring :as ring]


   [server.handlers.shifts :as shifts]
   [server.handlers.trucks :as trucks]
   [server.handlers.users :as users]))

(defroutes app-routes
  (GET "/" [] "Hello from Mars!")
  (GET "/shifts" [] (shifts/handler :GET))
  (GET "/trucks" [] (trucks/handler :GET))
  (GET "/users"  [] (users/handler  :GET))
  (not-found "invalid request."))

