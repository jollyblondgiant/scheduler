(ns server.api.users
   (:require [schema.core :as s]
             [cheshire.core :as json]))

(s/defschema AccessLevel
  {:role s/Str
   :access s/Int})

(s/defschema Truck
  {:id s/Int
   :access [1 2 3]})

(s/defschema User
  {:trucks [Truck]
   :first-name s/Str
   :last-name s/Str
   :email s/Str
   :phone s/Str
   :avatar s/Str
   :id s/Int})

(def get-users
  (json/generate-string []))