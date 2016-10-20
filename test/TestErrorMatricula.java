/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ALUMNEDAM
 */
public class TestErrorMatricula {

    public TestErrorMatricula() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
//
//     TODO add test methods here.
//     The methods must be annotated with annotation @Test. For example:

    @Test
    public void hello() {
    }
    //Test que devuelve el precio de matricula por menos de 12 UF's
    @Test
    public final void testMatriculaUfMenosDe12() throws noEnteros{
        assertEquals(330, MatriculasDam.matricula(11));
    }
    //Test que devuelve el precio de matricula por mas o igual a 12 UF's
    @Test
    public final void testMatriculaUfMasDe12() throws noEnteros{
        assertEquals(380, MatriculasDam.matricula(30));
    }
    //Si entra una letra lo envia a la Exception, aqui aunque da error es lo que haría realmente
    //Ya que daria Error (Comentado en clase)
    @Test
    public final void testMatricula0() throws noEnteros{
        assertEquals(noEnteros, MatriculasDam.matricula("a"));
    }


    

}
