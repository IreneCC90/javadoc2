/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaDoc;

/**
 *
 * @author cheir
 */
public class JavaDoc {

    public class Empleado extends Persona {
/**
 * Atributos privados
 */
        private int numeroEmpleado;

        private String departamento;

        private String puesto;
/**Constructor que pasa parámetros
 * 
 */
        public Empleado() {

        }

        public Empleado(String nombre,
                int edad,
                char sexo,
                int numeroEmpleado,
                String departamento,
                String puesto) {

            super(nombre, edad, sexo);

            this.numeroEmpleado = numeroEmpleado;

            this.departamento = departamento;

            this.puesto = puesto;

        }
/**
 * Recoger datos del objeto
 * @return 
 */
        public int getNumeroEmpleado() {

            return numeroEmpleado;

        }
/**
 * Establecer un numero
 * @param numeroEmpleado 
 */
        public void setNumeroEmpleado(int numeroEmpleado) {

            this.numeroEmpleado = numeroEmpleado;

        }
/**
 * 
 * @return 
 */
        public String getDepartamento() {

            return departamento;

        }
/**
 * 
 * @param departamento 
 */
        public void setDepartamento(String departamento) {

            this.departamento = departamento;

        }
/**
 * 
 * @return 
 */
        public String getPuesto() {

            return puesto;

        }
/**
 * 
 * @param puesto 
 */
        public void setPuesto(String puesto) {

            this.puesto = puesto;

        }

    }
}
