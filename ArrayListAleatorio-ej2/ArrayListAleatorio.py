'''
Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
ArrayList y que luego calcule la suma, la media, el maximo y el minimo de esos
numeros. El tamanno de la lista tambien sera aleatorio y podra oscilar entre 10
y 20 elementos ambos inclusive.


@author: Alberto Miguel Martinez Jimenez
'''
import random

lista = []

def numeroAleatorio(self,minimo,maximo): #Devuelve un valor aleatorio
    return random.randint(minimo,maximo)

def suma(self,lista): #Devuelve la suma de los elementos de la lista
    suma=0
    for numero in lista:
        suma+=numero
    return suma

def media(self,lista): #Devuelve la media de los elementos de la lista
    media=(suma(lista)/len(lista))
    return media

def maximo(self,lista): #Devuelve el valor maximo de la lista
    maximo=max(lista)
    return maximo

def minimo(self,lista): #Devuelve el valor minimo de la lista
    minimo=min(lista)
    return minimo

def introducirValores(self,lista):
    tamanno=numeroAleatorio(10,20)
    for lista in tamanno:
      lista=int(input(numeroAleatorio(0,100))) 
    
    
if __name__ == "__main__":
    
    introducirValores(lista)
    print(suma(lista))
    print(media(lista))
    print(maximo(lista))
    print(minimo(lista))
    