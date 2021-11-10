# GaragePubblico
applicazione Java per la gestione di un garage pubblico

## Testo dell'esercizio
Si realizzi un’applicazione Java per la gestione di un garage pubblico, secondo le specifiche dettate dal diagramma UML illustrato di seguito.
Il garage ha al massimo 15 posti, ognuno dei quali è identificato da un numero (a partire da zero) e, per motivi di capienza, può ospitare soltanto automobili, furgoni e motociclette.
Partendo dalla classe base VeicoloAMotore, la si estenda realizzando anche le classi che modellano le entità furgone, automobile e motocicletta. Ridefinire in particolare il metodo toString in modo che ogni entità possa esternalizzare in forma di stringa tutte le informazioni che la riguardano.
Si implementi poi una classe che modelli il garage sopra descritto, offrendo le seguenti operazioni di gestione:
- Immissione di un nuovo veicolo nel garage (ritornare il numero del posto assegnato);
- Estrazione dal garage del veicolo che occupa un determinato posto (ritornare l’istanza del veicolo
stesso);
- Stampa della situazione corrente dei posti nel garage: stampare per ogni posto tutte le
informazioni disponibili sul veicolo che lo sta occupando.

Si implementi un metodo main che testi l'utilizzo e il funzionamento delle classi sviluppate.
Le varie classi dovranno essere salvate in un package chiamato “garage”, mentre la classe contenente
il main dovrà essere posta nel package di default.
Il metodo main dovrà visualizzare all’utente un menù che permetta di scegliere fra le operazioni di
gestione del garage:
- inserimento di un’automobile,
- inserimento di una moto,
- inserimento di un furgone (e conseguenti inserimenti dei dati di ogni veicolo),
- possibilità di liberare un posto,
- stampa della situazione corrente dei posti
