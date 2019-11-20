<template>
  <div id="app">

    <FormularioHotel mensajeFormulario="Bienvenido a la página de reservas"/>
    <TituloElegir mensajeElegir="Bienvenido a la página para elegir el hotel"/>
    <Main mensajeMain="Pagina Principal"/>
    <Reservaciones mensajeReservaciones="Reserve su hotel ya"/>
  </div>
</template>

<script>
import TituloElegir from './components/ElegirHotel.vue'
import FormularioHotel from './components/FormularioHotel.vue'
import Main from './components/Main.vue'
import Reservaciones from './components/Reservaciones.vue'

export default {
  name: 'app',
  components: {
    FormularioHotel,
    TituloElegir,
    Main,
    Reservaciones
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
