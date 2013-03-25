<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : XMLEasyReq.xsl
    Created on : December 30, 2011, 7:16 PM
    Author     : jackpanzer
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="/">
        <xsl:for-each select="//Objeto">
            <xsl:if test=" tipo = 'CasoDeUso' ">
                <p/>
                <table border="1">
                    <tr>
                        <th>Nombre</th>
                        <td><xsl:value-of select="nombre" /></td>
                    </tr>
                    <tr>
                        <th>El sistema deberá</th>
                        <td>
                            <xsl:if test="detalles = 'PD'" >
                            <font color="red">PD</font>
                            </xsl:if>
                            <xsl:if test="detalles != 'PD'" >
                            <xsl:value-of select="detalles"/>
                            </xsl:if>
                        </td>
                    </tr>
                    <tr>
                        <th>¿Es abstracto?</th>
                        <td>
                            <xsl:value-of select="abstracto"/>
                        </td>
                    </tr>
                    <tr>
                        <th>Evento de activación</th>
                        <td>
                            <xsl:if test="eventoDeActivacion = 'PD'" >
                            <font color="red">PD</font>
                            </xsl:if>
                            <xsl:if test="eventoDeActivacion != 'PD'" >
                            <xsl:value-of select="eventoDeActivacion"/>
                            </xsl:if>
                        </td>
                        
                    </tr>
                    <tr>
                        <th>Frecuencia</th>
                        <td><xsl:value-of select="frecuencia" /></td>
                    </tr>
                    <tr>
                        <th>Precondición</th>
                        <td>
                            <xsl:if test="precondicion = 'PD'" >
                            <font color="red">PD</font>
                            </xsl:if>
                            <xsl:if test="precondicion != 'PD'" >
                            <xsl:value-of select="precondicion"/>
                            </xsl:if>
                        </td>
                    </tr>
                    <tr>
                        <th>Postcondición</th>
                        <td>
                            <xsl:if test="postcondicion = 'PD'" >
                            <font color="red">PD</font>
                            </xsl:if>
                            <xsl:if test="postcondicion != 'PD'" >
                            <xsl:value-of select="postcondicion"/>
                            </xsl:if>
                        </td>
                    </tr>
                    <tr>
                        <th>Comentarios</th>
                        <td>
                            <xsl:if test="comentarios = 'PD'" >
                            <font color="red">PD</font>
                            </xsl:if>
                            <xsl:if test="comentarios != 'PD'" >
                            <xsl:value-of select="comentarios"/>
                            </xsl:if>
                        </td>
                    </tr>
                    <tr>
                        <th>Pasos</th>
                        <td>
                            <xsl:if test="pasos//CuPaso//valor = 'PD'" >
                            <font color="red">PD</font>
                            </xsl:if>
                            <xsl:if test="pasos//CuPaso//valor != 'PD'" >
                            <xsl:for-each select="pasos//CuPaso">
                                <xsl:value-of select="valor"/>
                                <br/>
                            </xsl:for-each>
                            </xsl:if>
                            
                        </td>
                    </tr>
                    <tr>
                        <th>Excepciones</th>
                        <td>
                            <xsl:if test="excepciones//CuExcepcion//valor = 'PD'" >
                            <font color="red">PD</font>
                            </xsl:if>
                            <xsl:if test="excepciones//CuExcepcion//valor != 'PD'" >
                            <xsl:for-each select="excepciones//CuExcepcion">
                                <xsl:value-of select="valor"/>
                                <br/>
                            </xsl:for-each>
                            </xsl:if>
                        </td>
                    </tr>
                    <tr>
                        <th>Pioridades</th>
                        <td>
                            <xsl:for-each select="prioridades//CuPri">
                                <li><xsl:value-of select="valor"/></li>
                                <br/>
                            </xsl:for-each>
                        </td>
                    </tr>
                </table>
            </xsl:if>
            <xsl:if test=" tipo = 'Req_Funcional' ">
                <table>
                    <tr>
                        <div align="center"><h1>Requisito Funcional</h1></div>
                    </tr>
                    <tr>
                        <table border="1">
                            <tr>
                                <th>Nombre</th>
                                <td><xsl:value-of select="nombre" /></td>
                            </tr>
                            <tr>
                                <th>Descripción</th>
                                <td>
                                    <xsl:if test="descripcion = 'PD'"><font color="red">PD</font></xsl:if>
                                    <xsl:if test="descripcion != 'PD'"><xsl:value-of select="descripcion" /></xsl:if>
                                </td>
                            </tr>
                            <tr>
                                <th>Versión</th>
                                <td>
                                    <xsl:if test="version = 'PD'"><font color="red">PD</font></xsl:if>
                                    <xsl:if test="version != 'PD'"><xsl:value-of select="version" /></xsl:if>
                                </td>
                            </tr>
                            <tr>
                                <th>Importancia</th>
                                <td>
                                    <xsl:if test="importancia = 'PD'"><font color="red">PD</font></xsl:if>
                                    <xsl:if test="importancia != 'PD'"><xsl:value-of select="importancia" /></xsl:if>
                                </td>
                            </tr>
                            <tr>
                                <th>Urgencia</th>
                                <td>
                                    <xsl:if test="urgencia = 'PD'"><font color="red">PD</font></xsl:if>
                                    <xsl:if test="urgencia != 'PD'"><xsl:value-of select="urgencia" /></xsl:if>
                                </td>
                            </tr>
                            <tr>
                                <th>Estado</th>
                                <td>
                                    <xsl:if test="estado = 'PD'"><font color="red">PD</font></xsl:if>
                                    <xsl:if test="estado != 'PD'"><xsl:value-of select="estado" /></xsl:if>
                                </td>
                            </tr>
                            <tr>
                                <th>Estabilidad</th>
                                <td>
                                    <xsl:if test="estabilidad = 'PD'"><font color="red">PD</font></xsl:if>
                                    <xsl:if test="estabilidad != 'PD'"><xsl:value-of select="estabilidad" /></xsl:if>
                                </td>
                            </tr>
                            <tr>
                                <th>Comentarios</th>
                                <td>
                                    <xsl:if test="comentario = 'PD'"><font color="red">PD</font></xsl:if>
                                    <xsl:if test="comentario != 'PD'"><xsl:value-of select="comentarios" /></xsl:if>
                                </td>
                            </tr>
                            <tr>
                                <th>Dependencia</th>
                                <td>
                                    <xsl:if test="dependencia//RFDep//valor = 'PD'">
                                        <font color="red">PD</font>
                                    </xsl:if>
                                    <xsl:if test="dependencia//RFDep//valor != 'PD'">
                                        
                                        <xsl:for-each select="dependencia//RFDep" >
                                            <li><xsl:value-of select="valor" /></li>
                                        </xsl:for-each>
                                        
                                    </xsl:if>
                                </td>
                            </tr>
                        </table>
                    </tr>
                </table>
            </xsl:if>
            <xsl:if test=" tipo = 'Req_N_Funcional' ">
                <p/>
                <table>
                    <tr>
                        <div align="center"><h1>Requisito No Funcional</h1></div>
                    </tr>
                    <tr>
                        <table border="1">
                            <tr>
                                <th>Nombre</th>
                                <td><xsl:value-of select="nombre" /></td>
                            </tr>
                            <tr>
                                <th>Descripción</th>
                                <td>
                                    <xsl:if test="descripcion = 'PD'"><font color="red">PD</font></xsl:if>
                                    <xsl:if test="descripcion != 'PD'"><xsl:value-of select="descripcion" /></xsl:if>
                                </td>
                            </tr>
                            <tr>
                                <th>Versión</th>
                                <td>
                                    <xsl:if test="version = 'PD'"><font color="red">PD</font></xsl:if>
                                    <xsl:if test="version != 'PD'"><xsl:value-of select="version" /></xsl:if>
                                </td>
                            </tr>
                            <tr>
                                <th>Importancia</th>
                                <td>
                                    <xsl:if test="importancia = 'PD'"><font color="red">PD</font></xsl:if>
                                    <xsl:if test="importancia != 'PD'"><xsl:value-of select="importancia" /></xsl:if>
                                </td>
                            </tr>
                            <tr>
                                <th>Urgencia</th>
                                <td>
                                    <xsl:if test="urgencia = 'PD'"><font color="red">PD</font></xsl:if>
                                    <xsl:if test="urgencia != 'PD'"><xsl:value-of select="urgencia" /></xsl:if>
                                </td>
                            </tr>
                            <tr>
                                <th>Estado</th>
                                <td>
                                    <xsl:if test="estado = 'PD'"><font color="red">PD</font></xsl:if>
                                    <xsl:if test="estado != 'PD'"><xsl:value-of select="estado" /></xsl:if>
                                </td>
                            </tr>
                            <tr>
                                <th>Estabilidad</th>
                                <td>
                                    <xsl:if test="estabilidad = 'PD'"><font color="red">PD</font></xsl:if>
                                    <xsl:if test="estabilidad != 'PD'"><xsl:value-of select="estabilidad" /></xsl:if>
                                </td>
                            </tr>
                            <tr>
                                <th>Comentarios</th>
                                <td>
                                    <xsl:if test="comentario = 'PD'"><font color="red">PD</font></xsl:if>
                                    <xsl:if test="comentario != 'PD'"><xsl:value-of select="comentarios" /></xsl:if>
                                </td>
                            </tr>
                            <tr>
                                <th>Dependencia</th>
                                <td>
                                    <xsl:if test="dependencia//RFDep//valor = 'PD'">
                                        <font color="red">PD</font>
                                    </xsl:if>
                                    <xsl:if test="dependencia//RFDep//valor != 'PD'">

                                        <xsl:for-each select="dependencia//RFDep" >
                                            <li><xsl:value-of select="valor" /></li>
                                        </xsl:for-each>

                                    </xsl:if>
                                </td>
                            </tr>
                        </table>
                    </tr>
                </table>
            </xsl:if>
            <xsl:if test=" tipo = 'RInformacion' ">
                <table>
                    <tr>
                        <div align="center"><h1>Requisito de información</h1></div>
                    </tr>
                    <tr>
                        <table border="1">
                            <tr>
                                <th>Nombre</th>
                                <td><xsl:value-of select="nombre" /></td>
                            </tr>
                            <tr>
                                <th>Descripción</th>
                                <td>
                                    <xsl:if test="descripcion = ''"><font color="red">PD</font></xsl:if>
                                    <xsl:if test="descripcion != ''"><xsl:value-of select="descripcion" /></xsl:if>
                                </td>
                            </tr>
                            <tr>
                                <th>Versión</th>
                                <td>
                                    <xsl:if test="version = ''"><font color="red">PD</font></xsl:if>
                                    <xsl:if test="version != ''"><xsl:value-of select="version" /></xsl:if>
                                </td>
                            </tr>
                            <tr>
                                <th>Importancia</th>
                                <td>
                                    <xsl:if test="importancia = ''"><font color="red">PD</font></xsl:if>
                                    <xsl:if test="importancia != ''"><xsl:value-of select="importancia" /></xsl:if>
                                </td>
                            </tr>
                            <tr>
                                <th>Urgencia</th>
                                <td>
                                    <xsl:if test="urgencia = ''"><font color="red">PD</font></xsl:if>
                                    <xsl:if test="urgencia != ''"><xsl:value-of select="urgencia" /></xsl:if>
                                </td>
                            </tr>
                            <tr>
                                <th>Estado</th>
                                <td>
                                    <xsl:if test="estado = ''"><font color="red">PD</font></xsl:if>
                                    <xsl:if test="estado != ''"><xsl:value-of select="estado" /></xsl:if>
                                </td>
                            </tr>
                            <tr>
                                <th>Estabilidad</th>
                                <td>
                                    <xsl:if test="estabilidad = ''"><font color="red">PD</font></xsl:if>
                                    <xsl:if test="estabilidad != ''"><xsl:value-of select="estabilidad" /></xsl:if>
                                </td>
                            </tr>
                            <tr>
                                <th>Comentarios</th>
                                <td>
                                    <xsl:if test="comentario = ''"><font color="red">PD</font></xsl:if>
                                    <xsl:if test="comentario != ''"><xsl:value-of select="comentarios" /></xsl:if>
                                </td>
                            </tr>
                            <tr>
                                <th>Dependencia</th>
                                <td>
                                    <xsl:if test="dependencia//RIDep//valor = ''">
                                        <font color="red">PD</font>
                                    </xsl:if>
                                    <xsl:if test="dependencia//RIDep//valor != ''">
                                        
                                        <xsl:for-each select="dependencia//RIDep" >
                                            <li><xsl:value-of select="valor" /></li>
                                        </xsl:for-each>
                                        
                                    </xsl:if>
                                </td>
                            </tr>
                            <tr>
                                <th>Datos Especiales</th>
                                <td>
                                    <xsl:if test="datosespeciales//RIEsp//valor = ''">
                                        <font color="red">PD</font>
                                    </xsl:if>
                                    <xsl:for-each select="datosespeciales//RIEsp" >
                                        <li><xsl:value-of select="valor" /></li>
                                    </xsl:for-each>
                                </td>
                            </tr>
                        </table>
                    </tr>
                </table>
            </xsl:if>
            <xsl:if test=" tipo = 'Participante' ">
                <table>
                    <tr>
                        <div align="center">
                            <h1><xsl:value-of select="clase" />
                            </h1>
                        </div>
                    </tr>
                    <tr>
                        <table border="1">
                            <tr>
                                <th>Nombre</th>
                                <td><xsl:value-of select="nombre" /></td>
                            </tr>
                            <tr>
                                <th>Rol</th>
                                <td><xsl:value-of select="rol" /></td>
                            </tr>
                            <tr>
                                <th>Comentarios</th>
                                <td>
                                    <xsl:if test=" comentario = '' " >
                                        <font color="red">PD</font>
                                    </xsl:if>
                                    <xsl:if test=" comentario != '' " >
                                        <xsl:value-of select="comentario" />
                                    </xsl:if>
                                </td>
                            </tr>
                        </table>
                    </tr>
                </table>
            </xsl:if>
            <xsl:if test=" tipo = 'Objetivo' ">
                <p/>
                <table>
                    <tr>
                        <div align="center"><h1>Objetivo del sistema</h1></div>
                    </tr>
                    <tr>
                        <table border="1">
                            <tr>
                                <th>Nombre</th>
                                <td><xsl:value-of select="nombre" /></td>
                            </tr>
                            <tr>
                                <th>Descripción</th>
                                <td>
                                    <xsl:if test="descripcion = ''"><font color="red">PD</font></xsl:if>
                                    <xsl:if test="descripcion != ''"><xsl:value-of select="descripcion" /></xsl:if>
                                </td>
                            </tr>
                            <tr>
                                <th>Estado</th>
                                <td>
                                    <xsl:if test="estado = ''"><font color="red">PD</font></xsl:if>
                                    <xsl:if test="estado != ''"><xsl:value-of select="estado" /></xsl:if>
                                </td>
                            </tr>
                            <tr>
                                <th>Importancia</th>
                                <td>
                                    <xsl:if test="importancia = ''"><font color="red">PD</font></xsl:if>
                                    <xsl:if test="importancia != ''"><xsl:value-of select="importancia" /></xsl:if>
                                </td>
                            </tr>
                            <tr>
                                <th>Urgencia</th>
                                <td>
                                    <xsl:if test="urgencia = ''"><font color="red">PD</font></xsl:if>
                                    <xsl:if test="urgencia != ''"><xsl:value-of select="urgencia" /></xsl:if>
                                </td>
                            </tr>
                            <tr>
                                <th>Comentarios</th>
                                <td>
                                    <xsl:if test="comentarios = ''"><font color="red">PD</font></xsl:if>
                                    <xsl:if test="comentarios != ''"><xsl:value-of select="comentarios" /></xsl:if>
                                </td>
                            </tr>
                        </table>
                    </tr>
                </table>
            </xsl:if>
            <xsl:if test=" tipo = 'Reunion'">
                <table border="1"><div align="center">
                    <tr>
                        <th>Reunión</th>
                    </tr>
                    <tr>
                        <table border="0">
                            <tr><i><xsl:value-of select="nombre"/></i></tr>
                            <tr>A fecha del: <b><xsl:value-of select="fecha"/></b></tr>
                            <tr>
                                <td><b>Participantes</b></td>
                                <td>
                                    <xsl:for-each select="autores//campoA">
                                        <li><xsl:value-of select="valor"/></li>                                        
                                    </xsl:for-each>
                                </td>
                            </tr>
                            <tr>
                                <td><b>Clientes</b></td>
                                <td>
                                    <xsl:for-each select="clientes//campoC">
                                        <li><xsl:value-of select="valor"/></li>                                        
                                    </xsl:for-each>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <b>Puntos de interés<br/>de la reunión</b>
                                </td>
                                <td>
                                    <xsl:for-each select="puntos//campoP">
                                        <li><xsl:value-of select="valor"/></li>                                        
                                    </xsl:for-each>
                                </td>
                            </tr>
                        </table>
                    </tr>
                </div></table>
            </xsl:if>
            <xsl:if test=" tipo = 'Imagen' ">
                <img src="file:///{ruta}" />
                <br/>
            </xsl:if>
            <xsl:if test=" tipo = 'Parrafo' ">
                <i><xsl:value-of select="descripcion"/></i>
            </xsl:if>
            <xsl:if test=" tipo = 'Glosario' ">
                <br>
                <b><xsl:value-of select=" palabra "/></b>:
                <xsl:value-of select=" descripcion" />
                </br>
            </xsl:if>
            <xsl:if test=" tipo = 'Apendice' ">
                <h1><xsl:value-of select="clase"/></h1><br/>
                <b><u>Nombre: </u></b><xsl:value-of select="nombre"/><br/>
                <b><u>Autor: </u></b><xsl:value-of select="autor"/><br/>
                <i><xsl:value-of select="comentario" /></i><br/>
            </xsl:if>
        </xsl:for-each>
    </xsl:template>

</xsl:stylesheet>
