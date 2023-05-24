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
  (json/generate-string 
   [{:trucks [[1 3]]
     :first-name "Guy"
     :last-name "Fakeman"
     :email "guy.fake@foo.bar"
     :phone "15558675309"
     :avatar "guy.png"
     :id 1}
    {:trucks [[1 2]]
     :first-name "Sam"
     :last-name "Pleguy"
     :email "sam.pleg@foo.bar"
     :phone "15558675309"
     :avatar "sam.png"
     :id 1}]))