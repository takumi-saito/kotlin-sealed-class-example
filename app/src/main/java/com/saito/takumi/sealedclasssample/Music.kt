package com.saito.takumi.sealedclasssample

sealed class Music {
    abstract val id: Long
    abstract val title: String
    abstract val artistName: String

    data class Ringtone (
        override val id: Long,
        override val title: String,
        override val artistName: String
    ) : Music()

    data class Alarm (
        override val id: Long,
        override val title: String,
        override val artistName: String
    ) : Music()

    data class Default (
        override val id: Long,
        override val title: String,
        override val artistName: String
    ) : Music()
}