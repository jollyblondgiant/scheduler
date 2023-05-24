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
  (json/generate-string []))

