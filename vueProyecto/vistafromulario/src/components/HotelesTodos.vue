<template>

  <div >
  <Header />

    <div id="show-hotels" v-for="hotel in hotels" :key="hotel.id">
        <h1><router-link to="elegirHotel">{{hotel.name}}</router-link></h1>
        <table style="width:100%">
        <tr>
            <td>Puntuacion</td>
            <td>Pais</td>
            <td>Region</td>
            <td>Imagen</td>
        </tr>
            <tr>
                <td>{{hotel.score}}</td>
                <td>{{hotel.country}}</td>
                <td>{{hotel.region}}</td>
                <td><img :src=hotel.url align="right"></td>
            </tr>
        </table>
    </div>

  <Footer />
  </div>
</template>

<script>
import Header from './Header/Header';
import Footer from './Footer/Footer';

export default {
  name: 'HotelesTodos',

  components: {
        Header,
        Footer
  },

  props: ['main'],

  data(){
    return {
        hotels : [],
        data : 0
    }
  },
  methods: {

  },
   created() {

        this.$http.get('http://www.json-generator.com/api/json/get/bVKSVzMguq?indent=2').then(function(data){
                    this.hotels = data.body;
                });
   },
}

</script>

<style scoped>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
th, td {
  padding: 5px;
  text-align: left;
}
</style>