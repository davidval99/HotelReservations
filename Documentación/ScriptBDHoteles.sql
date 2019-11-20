PGDMP                     
    w            SistemaHoteles    11.2    11.2 #    6           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                       false            7           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                       false            8           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                       false            9           1262    16959    SistemaHoteles    DATABASE     �   CREATE DATABASE "SistemaHoteles" WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Spanish_Spain.1252' LC_CTYPE = 'Spanish_Spain.1252';
     DROP DATABASE "SistemaHoteles";
             postgres    false            �            1259    16960 
   habitacion    TABLE     �   CREATE TABLE public.habitacion (
    habitacion_id integer NOT NULL,
    precio integer NOT NULL,
    tipo_id integer NOT NULL,
    hotel_id integer NOT NULL
);
    DROP TABLE public.habitacion;
       public         postgres    false            �            1259    16963    hotel    TABLE     �   CREATE TABLE public.hotel (
    region character varying NOT NULL,
    puntuacion real NOT NULL,
    nombre character varying NOT NULL,
    hotel_id integer NOT NULL,
    pais character varying NOT NULL
);
    DROP TABLE public.hotel;
       public         postgres    false            �            1259    16969    imagenes_habitacion    TABLE     �   CREATE TABLE public.imagenes_habitacion (
    imagenes_habitacion_id integer NOT NULL,
    direccion character varying NOT NULL,
    habitacion_id_fk integer NOT NULL
);
 '   DROP TABLE public.imagenes_habitacion;
       public         postgres    false            �            1259    16975    imagenes_hotel    TABLE     �   CREATE TABLE public.imagenes_hotel (
    imagenes_hotel_id integer NOT NULL,
    direccion character varying NOT NULL,
    hotel_id_fk integer NOT NULL
);
 "   DROP TABLE public.imagenes_hotel;
       public         postgres    false            �            1259    16981 
   puntuacion    TABLE     �   CREATE TABLE public.puntuacion (
    puntuacion_id integer NOT NULL,
    hotel_id_fk integer NOT NULL,
    valor integer NOT NULL
);
    DROP TABLE public.puntuacion;
       public         postgres    false            �            1259    16984    reserva    TABLE     �   CREATE TABLE public.reserva (
    reserva_id integer NOT NULL,
    habitacion_id_fk integer NOT NULL,
    usuario_id_fk integer NOT NULL,
    fecha_inicio date NOT NULL,
    fecha_fin date NOT NULL
);
    DROP TABLE public.reserva;
       public         postgres    false            �            1259    16990    tipo_habitacion    TABLE     m   CREATE TABLE public.tipo_habitacion (
    tipo_id integer NOT NULL,
    nombre character varying NOT NULL
);
 #   DROP TABLE public.tipo_habitacion;
       public         postgres    false            �            1259    16996    usuario    TABLE       CREATE TABLE public.usuario (
    usuario_id integer NOT NULL,
    nombre character varying NOT NULL,
    apellido1 character varying NOT NULL,
    apellido2 character varying NOT NULL,
    correo character varying NOT NULL,
    num_tarjeta integer NOT NULL
);
    DROP TABLE public.usuario;
       public         postgres    false            ,          0    16960 
   habitacion 
   TABLE DATA               N   COPY public.habitacion (habitacion_id, precio, tipo_id, hotel_id) FROM stdin;
    public       postgres    false    196   .)       -          0    16963    hotel 
   TABLE DATA               K   COPY public.hotel (region, puntuacion, nombre, hotel_id, pais) FROM stdin;
    public       postgres    false    197   �*       .          0    16969    imagenes_habitacion 
   TABLE DATA               b   COPY public.imagenes_habitacion (imagenes_habitacion_id, direccion, habitacion_id_fk) FROM stdin;
    public       postgres    false    198   �-       /          0    16975    imagenes_hotel 
   TABLE DATA               S   COPY public.imagenes_hotel (imagenes_hotel_id, direccion, hotel_id_fk) FROM stdin;
    public       postgres    false    199   �-       0          0    16981 
   puntuacion 
   TABLE DATA               G   COPY public.puntuacion (puntuacion_id, hotel_id_fk, valor) FROM stdin;
    public       postgres    false    200   �-       1          0    16984    reserva 
   TABLE DATA               g   COPY public.reserva (reserva_id, habitacion_id_fk, usuario_id_fk, fecha_inicio, fecha_fin) FROM stdin;
    public       postgres    false    201   �-       2          0    16990    tipo_habitacion 
   TABLE DATA               :   COPY public.tipo_habitacion (tipo_id, nombre) FROM stdin;
    public       postgres    false    202   .       3          0    16996    usuario 
   TABLE DATA               `   COPY public.usuario (usuario_id, nombre, apellido1, apellido2, correo, num_tarjeta) FROM stdin;
    public       postgres    false    203   i.       �
           2606    17003    usuario USUARIO_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public.usuario
    ADD CONSTRAINT "USUARIO_pkey" PRIMARY KEY (usuario_id);
 @   ALTER TABLE ONLY public.usuario DROP CONSTRAINT "USUARIO_pkey";
       public         postgres    false    203            �
           2606    17005    habitacion habitacion_pkey 
   CONSTRAINT     c   ALTER TABLE ONLY public.habitacion
    ADD CONSTRAINT habitacion_pkey PRIMARY KEY (habitacion_id);
 D   ALTER TABLE ONLY public.habitacion DROP CONSTRAINT habitacion_pkey;
       public         postgres    false    196            �
           2606    17007    hotel hotel_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.hotel
    ADD CONSTRAINT hotel_pkey PRIMARY KEY (hotel_id);
 :   ALTER TABLE ONLY public.hotel DROP CONSTRAINT hotel_pkey;
       public         postgres    false    197            �
           2606    17009 ,   imagenes_habitacion imagenes_habitacion_pkey 
   CONSTRAINT     ~   ALTER TABLE ONLY public.imagenes_habitacion
    ADD CONSTRAINT imagenes_habitacion_pkey PRIMARY KEY (imagenes_habitacion_id);
 V   ALTER TABLE ONLY public.imagenes_habitacion DROP CONSTRAINT imagenes_habitacion_pkey;
       public         postgres    false    198            �
           2606    17011 "   imagenes_hotel imagenes_hotel_pkey 
   CONSTRAINT     o   ALTER TABLE ONLY public.imagenes_hotel
    ADD CONSTRAINT imagenes_hotel_pkey PRIMARY KEY (imagenes_hotel_id);
 L   ALTER TABLE ONLY public.imagenes_hotel DROP CONSTRAINT imagenes_hotel_pkey;
       public         postgres    false    199            �
           2606    17013    puntuacion puntuacion_pkey 
   CONSTRAINT     c   ALTER TABLE ONLY public.puntuacion
    ADD CONSTRAINT puntuacion_pkey PRIMARY KEY (puntuacion_id);
 D   ALTER TABLE ONLY public.puntuacion DROP CONSTRAINT puntuacion_pkey;
       public         postgres    false    200            �
           2606    17015    reserva reserva_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.reserva
    ADD CONSTRAINT reserva_pkey PRIMARY KEY (reserva_id);
 >   ALTER TABLE ONLY public.reserva DROP CONSTRAINT reserva_pkey;
       public         postgres    false    201            �
           2606    17017 $   tipo_habitacion tipo_habitacion_pkey 
   CONSTRAINT     g   ALTER TABLE ONLY public.tipo_habitacion
    ADD CONSTRAINT tipo_habitacion_pkey PRIMARY KEY (tipo_id);
 N   ALTER TABLE ONLY public.tipo_habitacion DROP CONSTRAINT tipo_habitacion_pkey;
       public         postgres    false    202            �
           2606    17018    reserva habitacion_id_fk    FK CONSTRAINT     �   ALTER TABLE ONLY public.reserva
    ADD CONSTRAINT habitacion_id_fk FOREIGN KEY (habitacion_id_fk) REFERENCES public.habitacion(habitacion_id);
 B   ALTER TABLE ONLY public.reserva DROP CONSTRAINT habitacion_id_fk;
       public       postgres    false    2717    201    196            �
           2606    17023 $   imagenes_habitacion habitacion_id_fk    FK CONSTRAINT     �   ALTER TABLE ONLY public.imagenes_habitacion
    ADD CONSTRAINT habitacion_id_fk FOREIGN KEY (habitacion_id_fk) REFERENCES public.habitacion(habitacion_id);
 N   ALTER TABLE ONLY public.imagenes_habitacion DROP CONSTRAINT habitacion_id_fk;
       public       postgres    false    198    196    2717            �
           2606    17028    imagenes_hotel hotel_id_fk    FK CONSTRAINT     �   ALTER TABLE ONLY public.imagenes_hotel
    ADD CONSTRAINT hotel_id_fk FOREIGN KEY (hotel_id_fk) REFERENCES public.hotel(hotel_id);
 D   ALTER TABLE ONLY public.imagenes_hotel DROP CONSTRAINT hotel_id_fk;
       public       postgres    false    197    199    2719            �
           2606    17033    puntuacion hotel_id_fk    FK CONSTRAINT        ALTER TABLE ONLY public.puntuacion
    ADD CONSTRAINT hotel_id_fk FOREIGN KEY (hotel_id_fk) REFERENCES public.hotel(hotel_id);
 @   ALTER TABLE ONLY public.puntuacion DROP CONSTRAINT hotel_id_fk;
       public       postgres    false    2719    197    200            �
           2606    17038    habitacion hotel_id_fk    FK CONSTRAINT     |   ALTER TABLE ONLY public.habitacion
    ADD CONSTRAINT hotel_id_fk FOREIGN KEY (hotel_id) REFERENCES public.hotel(hotel_id);
 @   ALTER TABLE ONLY public.habitacion DROP CONSTRAINT hotel_id_fk;
       public       postgres    false    2719    196    197            �
           2606    17043    habitacion tipo_id_fk    FK CONSTRAINT     �   ALTER TABLE ONLY public.habitacion
    ADD CONSTRAINT tipo_id_fk FOREIGN KEY (tipo_id) REFERENCES public.tipo_habitacion(tipo_id);
 ?   ALTER TABLE ONLY public.habitacion DROP CONSTRAINT tipo_id_fk;
       public       postgres    false    196    202    2729            �
           2606    17048    reserva usuario_id_fk    FK CONSTRAINT     �   ALTER TABLE ONLY public.reserva
    ADD CONSTRAINT usuario_id_fk FOREIGN KEY (usuario_id_fk) REFERENCES public.usuario(usuario_id);
 ?   ALTER TABLE ONLY public.reserva DROP CONSTRAINT usuario_id_fk;
       public       postgres    false    2731    201    203            ,   H  x�-�ɑCAC��T�C.�?��>��4`!��)	+E%� e�NEld��zk��d޻���q�ڻ�M�E䈇J�5łY3��,B�ܷ��(A�2�X�����I�"$²_��JeI�Z��"q/dH���uI�Э���Y1���'�S�֭X�#���Y($�Ñ�me��E,�\��r�Z䖷5�&h��g	Ky2���hrɏ����T��6�?�5@�Sq"ܥS���T��(w���t6,&�RV#��]#s�Z�PہA�4j��}�8�6�X��~d4�bw�Z�#�Ԏ�����Kr���Z�a�;U^%J�W�0����u_��c���i�      -     x�}U�r�0}_��0؄�#�IHR
I:���b�Y�H2)���lm�'[ڳ{���3���ή
0���(F��(<�X$�"����p<:���U.T
����)ڜ00ꄧ;�#9AH7rJ�C7��d}a�l	F&`59�(��cA��LȽ(�GX�2�#����&]y9����(Λ.&�Q��F&Q�q����Ge���MQS}�;r�Z�V�wpe�d��x��"Z�lD_̙N����(�+�HL��dde"[���
����2�a$���ٸ�#e���e���{�=qY sb=�x]���H��{�F��3�pv����A�i��?
L7�7A����刢�rBk*���i���}�(t��|���6ڧ�z�%MU�4�w��{@.Ty�*[�J��SkS�9N�L�1�^���ϭ�QD�� �r�T&sd�}��Ռ�����~]�ӈ�-��b�Oc�kE&V�qjF֨Dd8��*=$7��S�2������I�-�rrM�h�@�Iĝ��?*|��{]�'8G�M�r��ӛi��L.h��7;�@��z��h�,h�d�C���J�F�\nr2��ܠ�0R�=Tl�z���D|^����H�9�A��^�>xy�o孼��pr�Z��x=VaFN�s�ȵf`6�=�����i��h���-�ُ��N�����`3����ʂv2!Í֋L�\[N�-�s�Mx���s��=h���T��:���\�bl�����M��Y��tJ�Ɉx԰<r=<�2���R����*�]��4��ڭV�s��      .      x������ � �      /      x������ � �      0      x������ � �      1      x������ � �      2   @   x�3���K�,�L)M��2�t�O�I�2�)�, 2L�E��%�E��\��n���9��E\1z\\\ %��      3      x������ � �     