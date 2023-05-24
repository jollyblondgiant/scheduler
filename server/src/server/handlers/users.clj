(ns server.handlers.users
  (:require [server.api.users :as api]))


(defn get-users
  [params]
  (println params)
  {:status 200
   :body api/get-users})

(defn handler
  [method]
  (case method
    :GET get-users
    :else {:status 404
           :body "invalid request"}))