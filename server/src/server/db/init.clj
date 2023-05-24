(ns db.init
  (:require [datascript.core :as d]
            [server.db.users :as user]
            [server.db.trucks :as truck]
            [server.db.shifts :as shift]))

(def schema
  {:user user/schema
   :truck truck/schema
   :shift shift/schema})

(def conn (d/create-conn schema))


