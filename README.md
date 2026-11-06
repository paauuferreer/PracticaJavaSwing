# Pràctica Java Swing - Gestió de Lloguer de Videojocs

Aplicació d'escriptori desenvolupada amb Java Swing i NetBeans per a la gestió local de lloguer de videojocs, usuaris i estoc de plataformes en memòria.

## Requisits del sistema

- Java JDK 21 o superior
- Apache NetBeans 17 o superior
- Apache Maven

## Instruccions d'execució

1. Obrir Apache NetBeans.
2. Anar a **File > Open Project** i seleccionar la carpeta del projecte.
3. Fer clic amb el botó dret sobre el projecte i triar **Clean and Build**.
4. Executar el projecte prement **F6** o fent clic al botó verd de **Run Project**.

També es pot compilar i executar directament per terminal amb Maven:
```bash
mvn clean compile exec:java
```

## Dades inicials obligatòries carregades

En iniciar l'aplicació, es carreguen automàticament les dades de prova requerides per verificar el funcionament complet:

- **Usuaris:**
  - **Marc Rosselló Mas** (DNI: 43123456A, Tel: 611223344)
  - **Laura Pons Servera** (DNI: 43987654B, Tel: 655443322)

- **Videojocs i disponibilitat per plataforma:**
  - **The Legend of Zelda** (Gènere: Aventura)
    - PS5: 1 unitat disponible
    - Switch 2: 0 unitats disponibles (1 unitat consumida pel lloguer inicial)
  - **Halo Infinite** (Gènere: Acció)
    - Xbox: 2 unitats disponibles
    - PC: 1 unitat disponible (unitat retornada de lloguer previ)

- **Lloguers inicials:**
  - **Registre 01:** Marc Rosselló - The Legend of Zelda (Switch 2)
    - Data inici: 23/10/2026, Data límit: 30/10/2026.
    - Estat: **Fora de Termini (Vermell)** perquè la data de devolució ja ha vençut i no s'ha retornat.
  - **Registre 02:** Laura Pons - Halo Infinite (PC)
    - Data inici: 20/10/2026, Data límit: 27/10/2026.
    - Estat: **Retornat (Verd)** perquè es va retornar satisfactòriament.

## Funcionalitats principals

- **Finestra principal:** Visualització descendent de tots els lloguers amb marcatge per colors (Verd = Retornat, Vermell = Fora de termini).
- **Registre de lloguer:** Selecció dinàmica d'usuari i joc. Els botons de ràdio de les plataformes sense estoc es deshabiliten automàticament. Dates assignades i calculades automàticament.
- **Devolució de lloguer:** Taula amb lloguers pendents i opció de marcar com a retornat amb un sol clic, restaurant l'estoc a la plataforma corresponent.
- **Creació d'usuaris:** Validació centralitzada a través de `ValidationAPI`. Obliga que el nom i llinatges comencin amb majúscula inicial.
- **Creació de jocs:** Definició de gènere i assignació d'estoc per plataformes mitjançant caselles i selectors numèrics.
- **Integritat referencial:** Bloqueig d'eliminació d'usuaris o jocs que mantinguin lloguers actius.
- **Internacionalització:** Tots els textos de la interfície es gestionen a través del fitxer de recursos `Bundle_ca.properties` (català / mallorquí).

## Llista de comprovació per al lliurament

- [x] El projecte obre i executa correctament amb NetBeans.
- [x] El repositori conté un historial complet de commits convencionals des de NetBeans / Git.
- [x] El README està actualitzat amb instruccions d'execució i dades de prova.
- [x] Les dades inicials obligatòries estan carregades en iniciar l'aplicació.
- [x] El flux de lloguer i devolució està provat, incloent disponibilitat per plataforma.
- [x] Lloguers fora de data en vermell i retornats en verd a la finestra principal.
- [x] Interfície íntegrament en català amb fitxers `ValidationAPI` i `Bundle_ca`.
- [x] Validació de majúscula inicial en noms activada.
- [x] Cap botó o botó de ràdio permet una acció invàlida o sense estoc.
