/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.factory.impl.table;

import com.company.factory.interfaces.TableInterface;

/**
 *
 * @author jhonfre
 */
public class ModernTable implements TableInterface {

    @Override
    public String sellTable() {
        return "Proceso de venta para una mesa de tipo Moderna";
    }

    @Override
    public String getColor() {
        return "El color de la silla es negra";
    }

    @Override
    public String getTam() {
        return "El tamaño de la mesa es de 120x100";
    }
}
