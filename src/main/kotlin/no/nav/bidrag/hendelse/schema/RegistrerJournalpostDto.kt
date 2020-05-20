package no.nav.bidrag.hendelse.schema

data class RegistrerJournalpostDto(
        var namespace: String = "no.nav.bidrag.hendelse.producer.dto",
        var type: String = "record",
        var name: String = RegistrerJournalpostDto::class.simpleName?: "will not be null",
        var fields: List<Field> = emptyList()
)
