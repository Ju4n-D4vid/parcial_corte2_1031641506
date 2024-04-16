<template>
  <ion-page>
    <ion-header :translucent="true">
      <ion-toolbar>
        <ion-title class="ion-text-center">Tareas Domesticas</ion-title>
      </ion-toolbar>
    </ion-header>

    <ion-content :fullscreen="true">
      <form>
        <ion-card>
        <ion-card-header>
        <ion-card-title>Integrante</ion-card-title>
        <ion-card-subtitle>Tareas de Papá</ion-card-subtitle>
       </ion-card-header>
       <ion-card-content>
        Tareas a realizar:
        Traer Mercado,
        Lavar Auto,
        Arreglar silla
        </ion-card-content>
        <ion-list>
          <ion-checkbox label-placement="stacked" alignment="center">Traer Mercado</ion-checkbox>
          <ion-checkbox label-placement="stacked" alignment="center">Lavar Auto</ion-checkbox>
          <ion-checkbox label-placement="stacked" alignment="center">Arreglar Silla</ion-checkbox>
        </ion-list>
        </ion-card>


        <ion-card>
        <ion-card-header>
        <ion-card-title>Integrante</ion-card-title>
        <ion-card-subtitle>Tareas de Hermano</ion-card-subtitle>
       </ion-card-header>
       <ion-card-content>
        Tareas a realizar:
        Ordenar cuarto,
        Limpiar cocina,
        Podar Cesped
        </ion-card-content>
        <ion-list>
          <ion-checkbox label-placement="stacked" alignment="center">Ordenar Cuarto</ion-checkbox>
          <ion-checkbox label-placement="stacked" alignment="center">Limpiar cocina</ion-checkbox>
          <ion-checkbox label-placement="stacked" alignment="center">Podar Cesped</ion-checkbox>
        </ion-list>
        </ion-card>


        <ion-card>
        <ion-card-header>
        <ion-card-title>Integrante</ion-card-title>
        <ion-card-subtitle>Tareas de Hermana</ion-card-subtitle>
       </ion-card-header>
       <ion-card-content>
        Tareas a realizar:
        Ordenar cuarto,
        Lavar Ropa,
        Barrer-Trapear
        </ion-card-content>
        <ion-list>
          <ion-checkbox label-placement="stacked" alignment="center">Ordenar Cuarto</ion-checkbox>
          <ion-checkbox label-placement="stacked" alignment="center">Lavar Ropa</ion-checkbox>
          <ion-checkbox label-placement="stacked" alignment="center">Barrer-Trapear</ion-checkbox>
        </ion-list>
        </ion-card>
      </form>
    </ion-content>
  </ion-page>
</template>

<script setup lang="ts">
import { IonContent, IonHeader, IonPage, IonTitle, IonToolbar } from '@ionic/vue';
</script>

<style scoped>
#container {
  text-align: center;
  
  position: absolute;
  left: 0;
  right: 0;
  top: 50%;
  transform: translateY(-50%);
}

#container strong {
  font-size: 20px;
  line-height: 26px;
}

#container p {
  font-size: 16px;
  line-height: 22px;
  
  color: #8c8c8c;
  
  margin: 0;
}

#container a {
  text-decoration: none;
}
</style>
