/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.FactoryMethod.Factory;

import gof.FactoryMethod.buttons.Button;
import gof.FactoryMethod.buttons.WindowsButton;

/**
 *
 * @author fa20-bse-052
 */


/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}