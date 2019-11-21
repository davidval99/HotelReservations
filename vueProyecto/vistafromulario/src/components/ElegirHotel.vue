<template>
  <div class="hello">

    <Header />

    <table width="50%" align="center" border="0">
      <tr>
             <td><h2 align="left">Nombre del hotel</h2></td>
             <td><h2 align="center">Región</h2></td>
             <td><h2 align="right">Puntuación</h2></td>
      </tr>
      <tr>
            <td><h2 align="left">Riu</h2></td>
            <td><h2 align="center">Guanacaste</h2></td>
            <td><h2 align="right">9.8</h2></td>
            </tr>
    </table>

    <br><br><br>
    <img alt="imagen vacia" src="../assets/imagenVacia.jpg">
    <br><br>

    <table width="50%" align="center" border="0">
          <tr>
            <td><button  align="left">Like</button><button  align="left"> Dislike</button></td>
            <td>Habitaciones:<button style="margin:5px;"><router-link to="habitacion">Familiar</router-link></button>
            <button style="margin:5px;"><router-link to="habitacion">Individual</router-link></button>
            <button style="margin:5px;"><router-link to="habitacion">Doble</router-link></button></td>
          </tr>
    </table>

    <div align="left" style="margin-left:200px">
    <td><input type="text" name="titulo" value="Titulo"></td><br>
    <td><textarea rows="4" cols="50"></textarea></td><button>Send</button>
    </div>
    <br><br><br><br>
    <Footer />
  </div>
</template>

<script>
import Header from './Header/Header';
import Footer from './Footer/Footer';
export default {
  name: 'ElegirHotel',
  components: {
        Header,
        Footer
  },
}
</script>

<style scoped>

</style>
