(ns server.db.users)



(def schema
  {:user/id {:db/valueType :db.type/uuid
             :db/cardinality :db.cardinality/one}
   :user/first-name {:db/valueType :db.type/string
                     :db/cardinality :db.cardinality/one}
   :user/last-name {:db/valueType :db.type/string
                    :db/cardinality :db.cardinality/one}
   :user/email {:db/valueType :db.type/string
                :db/cardinality :db.cardinality/one}
   :user/phone {:db/valueType :db.type/string
                :db/cardinality :db.cardinality/one}
   :user/avatar {:db/valueType :db.type/string
                 :db/cardinality :db.cardinality/one}
   :user/trucks {:db/valueType :db.type/tuple
                 :db/doc "a vector of 2 integers: [truck-id access-level]"
                 :db/tupleType :db.type/number
                 :db/cardinality :db.cardinality/many}})