(ns server.db.trucks)

(def schema
  {:truck/id {:db/valueType :db.type/uuid
              :db/cardinality :db.cardinality/one}
   :truck/name {:db/valueType :db.type/string
                :db/cardinality :db.cardinality/one}
   :truck/theme {:db/cardinality :db.cardinality/one
                 :db/valueType :db.type/ref}
   :theme/id {:db/valueType :db.type/uuid
              :db/isComponent true
              :db/cardinality :db.cardinality/one}
   :theme/logo {:db/valueType :db.type/string
                :db/isComponent true
                :db/cardinality :db.cardinality/one}
   :theme/primary {:db/valueType :db.type/string
                   :db/doc "a hex value"
                   :db/isComponent true
                   :db/cardinality :db.cardinality/one}
   :theme/secondary {:db/valueType :db.type/string
                   :db/doc "a hex value"
                   :db/isComponent true
                   :db/cardinality :db.cardinality/one}})