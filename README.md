# F1 Musical Seats
Made using Kotlin Multiplatform.

See who's in and who's out of Formula 1 next year.


# Modules

## [Web](https://github.com/vitorhugods/f1-musical-seats/tree/main/web)
The Website, available at https://vitorhugods.github.io/f1-musical-seats/.
Built using Compose for Web.

It is deployed automatically on GitHub pages when the `main` branch is updated.

## [Shared](https://github.com/vitorhugods/f1-musical-seats/tree/main/shared)
Contains models that are shared between server and clients, things like JSON serialization and API specs.

The Docker image is published automatically when the `main` branch is updated. It is publicaly available on [DockerHub](https://hub.docker.com/repository/docker/vitorhugods/f1-musical-seats-server).
The server will eventually upate automatically using [Watchtower](https://github.com/containrrr/watchtower).

## [Server](https://github.com/vitorhugods/f1-musical-seats/tree/main/server)
The server, serving the API available on `https://f1seats.schwaab.xyz`. Currently, only [GET /confirmed-drivers](https://f1seats.schwaab.xyz/confirmed-drivers) exists.
Built using Ktor-server.

## [Shared-Clients](https://github.com/vitorhugods/f1-musical-seats/tree/main/shared-clients)
The client logic. At the moment it consumes the API mentioned above and nothing else.
Built using Ktor-client.

## [Android](https://github.com/vitorhugods/f1-musical-seats/tree/main/android)
_TO-DO_. As an Android Developer, this is the least exciting part, so I'm leaving it for last :)

License
-------

    Copyright 2022 Vitor Hugo D. Schwaab

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
