(ns server.handlers.trucks
  (:require [server.api.trucks :as api]))


(defn get-trucks
  [params]
  (println params)
   {:status 200
    :body api/get-trucks})

(defn handler
  [method]
  (case method
    :GET get-trucks
    :else {:status 404
           :body "invalid request"})
 )