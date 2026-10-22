# PrÃ ctica Java Swing - GestiÃ³ de Lloguer de Videojocs

AplicaciÃ³ d'escriptori desenvolupada amb Java Swing i NetBeans per a la gestiÃ³ local de lloguer de videojocs, usuaris i estoc de plataformes en memÃ²ria.

## Requisits del sistema

- Java JDK 21 o superior
- Apache NetBeans 17 o superior
- Apache Maven

## Instruccions d'execuciÃ³

1. Obrir Apache NetBeans.
2. Anar a **File > Open Project** i seleccionar la carpeta del projecte.
3. Fer clic amb el botÃ³ dret sobre el projecte i triar **Clean and Build**.
4. Executar el projecte prement **F6** o fent clic al botÃ³ verd de **Run Project**.

TambÃ© es pot compilar i executar directament per terminal amb Maven:
`ash
mvn clean compile exec:java
`

## Dades inicials obligatÃ²ries carregades

En iniciar l'aplicaciÃ³, es carreguen automÃ ticament les dades de prova requerides per verificar el funcionament complet:

- **Usuaris:**
  - **Marc RossellÃ³ Mas** (DNI: 43123456A, Tel: 611223344)
  - **Laura Pons Servera** (DNI: 43987654B, Tel: 655443322)

- **Videojocs i disponibilitat per plataforma:**
  - **The Legend of Zelda** (GÃ¨nere: Aventura)
    - PS5: 1 unitat disponible
    - Switch 2: 0 unitats disponibles (1 unitat consumida pel lloguer inicial)
  - **Halo Infinite** (GÃ¨nere: AcciÃ³)
    - Xbox: 2 unitats disponibles
    - PC: 1 unitat disponible (unitat retornada de lloguer previ)

- **Lloguers inicials:**
  - **Registre 01:** Marc RossellÃ³ - The Legend of Zelda (Switch 2)
    - Data inici: 23/10/2026, Data lÃ­mit: 30/10/2026.
    - Estat: **Fora de Termini (Vermell)** perquÃ¨ la data de devoluciÃ³ ja ha venÃ§ut i no s'ha retornat.
  - **Registre 02:** Laura Pons - Halo Infinite (PC)
    - Data inici: 20/10/2026, Data lÃ­mit: 27/10/2026.
    - Estat: **Retornat (Verd)** perquÃ¨ es va retornar satisfactÃ²riament.

## Funcionalitats principals

- **Finestra principal:** VisualitzaciÃ³ descendent de tots els lloguers amb marcatge per colors (Verd = Retornat, Vermell = Fora de termini).
- **Registre de lloguer:** SelecciÃ³ dinÃ mica d'usuari i joc. Els botons de rÃ dio de les plataformes sense estoc es deshabiliten automÃ ticament. Dates assignades i calculades automÃ ticament.
- **DevoluciÃ³ de lloguer:** Taula amb lloguers pendents i opciÃ³ de marcar com a retornat amb un sol clic, restaurant l'estoc a la plataforma corresponent.
- **CreaciÃ³ d'usuaris:** ValidaciÃ³ centralitzada a travÃ©s de ValidationAPI. Obliga que el nom i llinatges comencin amb majÃºscula inicial.
- **CreaciÃ³ de jocs:** DefiniciÃ³ de gÃ¨nere i assignaciÃ³ d'estoc per plataformes mitjanÃ§ant caselles i selectors numÃ¨rics.
- **Integritat referencial:** Bloqueig d'eliminaciÃ³ d'usuaris o jocs que mantinguin lloguers actius.
- **InternacionalitzaciÃ³:** Tots els textos de la interfÃ­cie es gestionen a travÃ©s del fitxer de recursos Bundle_ca.properties (catalÃ  / mallorquÃ­).