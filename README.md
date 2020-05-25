# bidrag-hendelse-schema

![](https://github.com/navikt/bidrag-hendelse-schema/workflows/maven%20deploy/badge.svg)

Schema definisjoner for bidrag-hendelse

Dette prosjektet bruker avro-maven-plugin til å lese schema records slik at det genereres java klasser som skal brukes av kafka produsenter og konsumenter. 

## release endringer

versjon | endringstype      | beskrivelse
--------|-------------------|------------------------
0.0.1   | Bruk Schema record| `Record: RegistrerJournalpostDto`
0.0.2   | Endre var type    | endret saksnummer til string type 
