<template>
  <div>
    <Header />
    <br><br>

    <table width="45%" align="center" border="0">

        <td><label>Nombre:</label>
        <br>
        <input type="text" name="filtro">
        <br><br>
        <button><router-link to="elegirHotel">Buscar</router-link></button></td>

        <td><label>Filtros:</label>
        <br>
        <button  style="margin:5px;"><router-link to="hotelesTodos">Listar todos los hoteles</router-link></button>
        <button  style="margin:5px;"><router-link to="hotelesPuntuacion">Listar hoteles por puntuacion</router-link></button>
        <button  style="margin:5px;"><router-link to="hotelesPais">Listar hoteles por pais</router-link></button>
        <button  style="margin:5px;"><router-link to="hotelesRegion">Listar hoteles por region</router-link></button>
        </td>

     </table>

    <br><br>
    <img src="https://i.postimg.cc/RVvK15nJ/hotel-con-encanto-en-granada-1.jpg">
    <br><br><br><br>

    <button><router-link to="reservaciones">Ver Reservaciones</router-link></button>

    <br><br><br>

    <Footer />
  </div>
</template>

<script>
import Header from './Header/Header';
import Footer from './Footer/Footer';

export default {

  data() {

  },

  components: {
        Header,
        Footer
  },

  methods: {

  }
}

</script>

<style scoped>

</style>