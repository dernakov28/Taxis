# GET http://localhost:8080/taxis/managers
## response
```
[
    {
        id: <int>,
        name: <str>,
        surName: <str>
    },
    ...
]

```
# GET http://localhost:8080/taxis/drivers?manager=
## response
```
[
    {
        id: <int>,
        name: <str>,
        surName: <str>,
        car: {
            id: <int>,
            model: <str>,
            number: <str>,
            color: <str>
        },
        manager: {
            id: <int>,
            name: <str>,
            surName: <str>
        }
    },
    ...
]

```

# POST http://localhost:8080/taxis/drivers
## request
```
{
    name: <str>,
    surName: <str>,
    car: {
        id: <int>,
        model: <str>,
        number: <str>,
        color: <str>
    },
    manager: {
        id: <int>
    }
}

```
## response
```
{
    id: <int>,
    name: <str>,
    surName: <str>,
    car: {
        id: <int>,
        model: <str>,
        number: <str>,
        color: <str>
    },
    manager: {
        id: <int>,
        name: <str>,
        surName: <str>
    }
}

```

# DELETE http://localhost:8080/taxis/drivers
## request
```
{
    id: <int>
}

```
