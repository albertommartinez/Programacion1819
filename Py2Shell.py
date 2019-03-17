'''
Ejecuto ordenes en la Shell de sistema segun el SO
si el parametro de Win64 es un '-' ejecuta el mismo que en Win32 

@param actionWin32 comando si el SO es un Win32
@param actionWin64 comando si el SO es un Win64
@param actionLinux comando si el SO es un Linux
@param actionMac comando si el SO es un Mac
@param default comando por defecto si el SO no es ninguno de los anteriores
@author Alberto Miguel Martinez Jimenez
'''
import os
import sys

def py2Shell(actionWin32,actionWin64,actionLinux,actionMac,default):
    so=sys.platform
    if(so=="win32"):
        os.system(actionWin32)#ejecuta orden windows32
    elif(so=="win64"):
        if(actionWin64=="-"):
            os.system(actionWin32)#ejecuta orden windows32
        else:
            os.system(actionWin64)#ejecuta orden windows64
    elif(so=="linux2"):
        os.system(actionLinux)#ejecuta orden linux
    elif(so=="darwin"):
        os.system(actionMac)#ejecuta orden mac
    else:
        os.system(default)#ejecuta orden orden en caso de no darse las premisas anteriores
'''
En caso de ejecutar el modulo desde si mismo
se ejecuta este main
'''
if __name__ == "__main__":
    '''este ejemplo lista el directorio local con el comando necesario en el SO local'''
    print(py2Shell("dir","dir","ls","ls","ls")) 
