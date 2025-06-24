```mermaid

classDiagram
    
    direction LR
    
    class Animal {
        <<Abstract>>
        
        - nome: String
        
        + toString() String *
    }
    
    class Arara {
        
    }
    
    class Avestruz {
        
    }
    
    class Baleia {
        
    }
    
    class Cachorro {
        
    }
    
    class Gato {
        
    }
    
    class Leao {
        
    }
    
    class Lobo {
        
    }
    
    class Macaco {
        
    }
    
    class Morcego {
        
    }
    
    class Pinguim {
        
    }
    
    class Ornitorrinco {
        
    }
    
    Animal <|-- Arara
    Animal <|-- Avestruz
    Animal <|-- Baleia
    Animal <|-- Cachorro
    Animal <|-- Gato
    Animal <|-- Leao
    Animal <|-- Lobo
    Animal <|-- Macaco
    Animal <|-- Morcego
    Animal <|-- Pinguim
    Animal <|-- Ornitorrinco
    
    Voador <|.. Arara
    Voador <|.. Morcego
    
    Nadador <|.. Baleia
    Nadador <|.. Pinguim
    Nadador <|.. Ornitorrinco
    
    Corredor <|.. Avestruz
    Corredor <|.. Cachorro
    Corredor <|.. Gato
    Corredor <|.. Leao
    Corredor <|.. Lobo
    Corredor <|.. Macaco
    
    Saltador <|.. Avestruz
    Saltador <|.. Cachorro
    Saltador <|.. Gato
    Saltador <|.. Leao
    Saltador <|.. Lobo
    Saltador <|.. Macaco

    EmissorDeSom <|.. Arara
    EmissorDeSom <|.. Avestruz
    EmissorDeSom <|.. Baleia
    EmissorDeSom <|.. Cachorro
    EmissorDeSom <|.. Gato
    EmissorDeSom <|.. Leao
    EmissorDeSom <|.. Lobo
    EmissorDeSom <|.. Macaco
    EmissorDeSom <|.. Morcego
    EmissorDeSom <|.. Pinguim
    EmissorDeSom <|.. Ornitorrinco

    Dorminhoco <|.. Arara
    Dorminhoco <|.. Avestruz
    Dorminhoco <|.. Baleia
    Dorminhoco <|.. Cachorro
    Dorminhoco <|.. Gato
    Dorminhoco <|.. Leao
    Dorminhoco <|.. Lobo
    Dorminhoco <|.. Macaco
    Dorminhoco <|.. Morcego
    Dorminhoco <|.. Pinguim
    Dorminhoco <|.. Ornitorrinco
    
    class Voador {
        <<interface>>
        
        + voar() String *
        + pousar() String  *
    }
    
    class Nadador {
        <<interface>>
        
        + mergulhar() String *
        + nadar() String *
    }
    
    class Corredor {
        <<interface>>
        
        + correr() String *
    }
    
    class Saltador {
        <<interface>>
        
        + saltar() String *
    }
    
    class Comedor {
        <<interface>>
        
        + comer() String *
    }
    
    class EmissorDeSom {
        <<interface>>
        
        + emitirSom() String *
    }
    
    class Dorminhoco {
        <<interface>>
        
        + deitar() String *
        + cochilar() String *
        + dormir() String *
        + acordar() String *
    }
    
    




```