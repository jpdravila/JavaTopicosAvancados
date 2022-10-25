package JavaScriptNashorn;

import javax.script.*;
import java.io.FileReader;

public class JavaScriptExemplo {
    public static void main(String[] args) {

        ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");

        Bindings bind = ee.getBindings(ScriptContext.ENGINE_SCOPE);

        try {
            ee.eval(new FileReader("olamundo.js"));
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
