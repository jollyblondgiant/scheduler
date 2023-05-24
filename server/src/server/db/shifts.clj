(ns server.db.shifts)

(def schema
  {:shift/id {:db/valueType :db.type/uuid
              :db/cardinality :db.cardinality/one}
   :shift/start-time {:db/valueType :db.type/bigint
                      :db/cardinality :db.cardinality/one}
   :shift/end-time {:db/valueType :db.type/bigint
                    :db/cardinality :db.cardinality/one}
   :shift/staff {:db/valueType :db.type/number
                 :db/cardinality :db.cardinality/many}
   :shift/truck {:db/valueType :db.type/number
                 :db/cardinality :db.cardinality/one}
   :shift/event-name {:db/valueType :db.type/string
                      :db/cardinality :db.cardinality/one}
   :shift/event-description {:db/valueType :db.type/string
                             :db/cardinality :db.cardinality/one}
   :shift/location {:db/cardinality :db.cardinality/one
                    :db/valueType :db.type/ref}
   ;;;
   :location/id {:db/valueType :db.type/uuid
                 :db/isComponent true
                 :db/cardinality :db.cardinality/one}
   :location/address {:db/cardinality :db.cardinality/one
                      :db/isComponent true
                      :db/valueType :db.type/ref}
   ;;
   :address/street {:db/valueType :db.type/string
                    :db/isComponent true
                    :db/cardinality :db.cardinality/one}
   :address/city {:db/valueType :db.type/string
                  :db/isComponent true
                  :db/cardinality :db.cardinality/one}
   :address/state {:db/valueType :db.type/string
                   :db/isComponent true
                   :db/cardinality :db.cardinality/one}
   :address/zip {:db/valueType :db.type/string
                 :db/isComponent true
                 :db/cardinality :db.cardinality/one}

   :location/geolocation {:db/cardinality :db.cardinality/one
                          :db/isComponent true
                          :db/valueType :db.type/ref}
   ;;;
   :geolocation/latitude {:db/valueType :db.type/float
                          :db/isComponent true
                          :db/cardinality :db.cardinality/one}
   :geolocation/longitude {:db/valueType :db.type/float
                          :db/isComponent true
                          :db/cardinality :db.cardinality/one}})