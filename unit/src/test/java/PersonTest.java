import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Person")
class PersonTest {

    private Person person;


    @Test
    @DisplayName("should call vector add function")
    void move() {
        // On crée des versions factices de la classe Vector
        Vector mockPosition = Mockito.mock(Vector.class);
        Vector newMockPosition = Mockito.mock(Vector.class);
        Vector returnedMockPosition = Mockito.mock(Vector.class);

        // On utilise le mock pour instancier person
        person = new Person("John Doe", mockPosition);

        // On définie la valeur de retour de la fonction mockée
        Mockito.when(mockPosition.add(newMockPosition)).thenReturn(returnedMockPosition);

        // La fonctino à tester
        person.move(newMockPosition);

        // On vérifie que la méthode Vector.add a bien été appelée
        Mockito.verify(mockPosition).add(newMockPosition);
    }
}