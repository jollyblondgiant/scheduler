(ns server.api.shifts
  (:require [schema.core :as s]
             [cheshire.core :as json]))

(s/defschema GeoLocation
  {:latitude s/Num
   :longitude s/Num})

(s/defschema Address
  {:street s/Str
   :city s/Str
   :state s/Str
   :zip s/Str})

(s/defschema Location
  {:name s/Str
   :address Address
   :geolocation GeoLocation})

(s/defschema Shift 
  {:start-time s/Int
   :end-time s/Int
   :staff [s/Int]
   :truck s/Int
   :location Location
   (s/optional-key :event-name) s/Str
   (s/optional-key :event-description) s/Str})

(def get-shifts
  (json/generate-string 
   [{:start-time 1684854000
     :end-time 1684864800
     :staff [1]
     :truck 1
     :location {:name "Central Filling Station"
                :address {:street "900 N. Central St."
                          :city "Knoxville"
                          :state "TN"
                          :zip "37917"}
                :geolocation {:latitude 35.97793
                              :longitude -83.9254}}
     :event-name "optional"
     :event-description "optional"}
    {:start-time 1684922400
     :end-time 1684933200
     :staff [1]
     :truck 1
     :location {:name "Central Filling Station"
                :address {:street "900 N. Central St."
                          :city "Knoxville"
                          :state "TN"
                          :zip "37917"}
                :geolocation {:latitude 35.97793
                              :longitude -83.9254}}
     :event-name "optional"
     :event-description "optional"}]))

