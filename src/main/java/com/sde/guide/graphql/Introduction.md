
### GraphQL Preparation ###

Company name: [Hasura]("https://hasura.io/")


#### GraphQL:

GraphQL is a query language for APIs and a runtime for executing those queries, the main objective of GraphQL is to give
clients the liberty to choose the data which they want to extract from the API, reducing the over-fetching and
under-fetching of data in RESTFul apis.


Some of the features of GraphQL:
* It supports a strongly typed schema, it generally specifies the type of data client can expect while querying and the
    relationships between those data types.
* Single endpoint support: Unlike rest services, where different endpoints have different resources. GraphQL has a 
    single endpoint that serves all queries.
* Real-time data with subscriptions: GraphQL has support for real time data updates through subscriptions.
* Nested Queries: You can retrieve related data using a single query.
* Introspection: GraphQL has a strong introspection feature, clients can validate their queries using tools like 
    GraphiQL.


```graphql
query {
    user(id: 1001) {
        username,
        firstName,
        lastName,
        course {
            title,
            code
        }
    }
}
```

