# GraphQL

## What is GraphQL
### Intro
* A client wants to access data on a server(across network)
* Open sourced in 2015
* statically typed API + query language
* Sweet pots are SPA and native clients
* An alternative to REST APIs
* Developer Experience

### GraphQL Schema

* Describe your API
* Defined on ther server
* Based on simple static type system
* Schema Definition Language is used to describe a Schema

### GraphQL Query Language

* Custom query language
* clients define the query based on their needs
* Every field needs to be request explicitly


### GraphQL Ecosystem

* The GraphQL spec defines how GraphQL queries should be executed
* It defines the GraphQL schema + query language
* First there was sepc + reference implementation in JS(GraphQL.js)
* Next it was implemented in every major language

## GraphQL Java

### GraphQL Java

* It is an implementation for the server side GraphQL execution(execution engine)
* Start in 2015
* Pure engine: No Http or IO, No high level abstracts
* graphql-java.com

### How to think in GraphQL Java

* Start designing by putting the Schema first
* Usecase and client oriented
* Define the schema in SDL(textual format preferred) or programmatically
* Schema is made out of types with fields
* Fundamental rule : every field has a DataFetcher associated with
* DataFetcher fetches the data for one specific field
* If you don't specify a DataFetcher a default DataFetcher is provided

### From GraphQL Java to Spring GraphQL:
* *Spring GraphQL is the missing gap in the developer story*
* GraphQL Java is 'limited' on purpose
* GraphQL Java lets you do everything, but not everything is as simple and convenient as possible
* The Spring and GraphQL Java teams came together to fix that
* Spring GraphQL is focused on comprehensive and first level support
* It aims to be a fundamental building block build directly on GrpahQL Java


## Spring GraphQL

* Web Transports -> handlers for mvc and webflux
* annotated controllers / *functional http handlers*
    * We need only one handler we don't need a wide variety of handlers where annotations begin to be handy.
    
