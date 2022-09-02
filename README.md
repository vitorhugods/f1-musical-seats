# F1 Musical Seats
Made using Kotlin Multiplatform.

See who's in and who's out of Formula 1 next year.


# Modules

## [Web](https://github.com/vitorhugods/f1-musical-seats/tree/main/web)
The Website, available at https://vitorhugods.github.io/f1-musical-seats/.

It is deployed automatically on GitHub pages when the `main` branch is updated.

## [Shared](https://github.com/vitorhugods/f1-musical-seats/tree/main/shared)
Contains models that are shared between server and clients, things like JSON serialization and API specs.

The Docker image is published automatically when the `main` branch is updated. It is publicaly available on [DockerHub](https://hub.docker.com/repository/docker/vitorhugods/f1-musical-seats-server).
The server will eventually upate automatically using [Watchtower](https://github.com/containrrr/watchtower).

## [Server](https://github.com/vitorhugods/f1-musical-seats/tree/main/server)
The server, serving the API available on `https://f1seats.schwaab.xyz`. Currently, only [GET /confirmed-drivers](https://f1seats.schwaab.xyz/confirmed-drivers) exists.

## [Shared-Clients](https://github.com/vitorhugods/f1-musical-seats/tree/main/shared-clients)
The client logic. At the moment it consumes the API mentioned above and nothing else.

## [Android](https://github.com/vitorhugods/f1-musical-seats/tree/main/android)
_TO-DO_. As an Android Developer, this is the least exciting part, so I'm leaving it for last :)
