(ns server.handlers.shifts
  (:require [server.api.shifts :as api]))


(defn get-shifts
  [params]
  (println params)
  {:status 200
   :body api/get-shifts})

(defn handler
  [method]
  (case method
    :GET  get-shifts
    :else {:status 404
           :body "Invalid route"}))