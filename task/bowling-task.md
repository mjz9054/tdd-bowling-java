# Bowling Tasking

- With no SPARE and no STRIKE 
    - `Given` a list of knockdown bottles with no SPARE and no STRIKE
    - `when` calculate total score 
    - `then` score equals total knockdown bottles
- With at least one SPARE and no STRIKE
    - `Given` a list of knockdown bottles with at least one SPARE and no STRIKE 
    - `when` calculate total score 
    - `then` score equals total knockdown bottles plus the following one knockdown bottles after each SPARE
- With at least one STRIKE and no SPARE
    - `Given` a list of knockdown bottles with at least one STRIKE and no SPARE
    - `when` calculate total score 
    - `then` score equals total knockdown bottles plus the following two knockdown bottles after each STRIKE
- With at least one STRIKE and at least one SPARE
    - `Given` a list of knockdown bottles with at least one STRIKE and at least one SPARE
    - `when` calculate total score 
    - `then` score equals total knockdown bottles plus the following two knockdown bottles after each STRIKE plus the following one knockdown bottles after each SPARE