package com.example.marsphotos.data


interface AppContainer {
    val marsPhotosRepository: MarsPhotosRepository
}
class DefaulAppContainer : AppContainer