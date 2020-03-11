# ArcMovie Code Challange.

This is a simple front end that will query that from a api and present it in a table format that can be searched by movie name;

## Installation

In the project directory, you can run:

To start the application:

Build image

```bash
 docker image build . -t arcmovie
```
Run application container:

```bash
 docker container run -p 8080:8080 -d -name arcjava arcmovie
```

## Available API

[arcmovie-backend.herokuapp.com/](https://arcmovie-backend.herokuapp.com/)

## Versions

#### Version 1
 Endpoint /v1/movies/ - Get all movies from tmdb, iterating through each page.

#### Version 2 (Goes with V2 front-end)
 Endpoint /v1/movies/pages/{pages} - Get all movies from a page.

 Endpoint /v1/movies/find/{name} - Find movie by name.

#### Version 3
 Add Redis to cache request made to tmDb api

## Contributing

João Assis

### General thoughts

As an MVP, I did not want to build a over complex architect structure, but i would love to make the ground to a sclable webapp.

First thing came to mind was a redirect middleware, and that is what version 1 of the app is. Version 1 would make as many request to TmDb as necessary to get all movies and send it to the front-end. 

Version 2 is a slightly better approach, it breaks the request to all movies to get movie pages, and as needed by the frontend, it will fetch new movie pages. This approach comes with a need to do the search requirement at the backend, cause we will no have all movies available at frontend, but it is more scalable then v1;

Version 1 and 2 can be benefited by working with some kind of cache mechanism like Redis, or even some in memory structure as it would reduce the number of requests made to tmDb


## License
[MIT](https://choosealicense.com/licenses/mit/)