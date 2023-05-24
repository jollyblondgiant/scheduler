(ns server.api.trucks
   (:require [schema.core :as s]
             [cheshire.core :as json]))

(s/defschema Theme
  {:logo s/Str
   :primary s/Str
   :secondary s/Str})

(s/defschema Truck
  {:id s/Int
   :name s/Str
   :theme Theme})

(def get-trucks
  (json/generate-string 
   [{:id 1
     :name "Spiffy Spud"
     :theme {:logo "spud.png"
             :primary "#FF0000"
             :secondary "000000"}}
    {:id 2
     :name "Poutine Pontoon"
     :theme {:logo "pontoon.png"
             :primary "#FF0000"
             :secondary "000000"}}]))