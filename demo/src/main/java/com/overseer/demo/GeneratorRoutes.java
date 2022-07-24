package com.overseer.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.context.ApplicationContext;
import com.overseer.controllers.interf.Generator;
import com.overseer.models.interf.BotModel;
import com.overseer.models.interf.ConfigModel;

@RestController
public class GeneratorRoutes {

    private Generator gen;

    public GeneratorRoutes(ApplicationContext context){
        this.gen = (Generator)context.getBean("generatorimplem");
    }

    @GetMapping("/bots")
    public String getBots() {
        return "getBots";
    }

    @GetMapping("/bots/{name}")
    public String getBotbyName(@PathVariable String name) {
        return "get bot by name";
    }

    @GetMapping("/bots/{name}/generate")
    public String generateConfigFileToBotLoc(@PathVariable String name) {
        return "app will generate a new JSON file on the bot config location saved in Bot";
    }

    @GetMapping("/configs/{name}")
    public String getConfigsByBotName(@PathVariable String name) {
        return "get all configs owned by bot using name";
    }

    @GetMapping("/configs/{name}/{key}")
    public String getBotConfigByKey(@PathVariable String name, @PathVariable String key) {
        return "get config owned by botname using key";
    }

    @PostMapping("/bots")
    public String createBot(@RequestBody BotModel bot) {
        gen.addBot(bot);
        return "added bot";
    }

    @PostMapping("/configs")
    public String createConfig(@RequestBody ConfigModel config) {
        gen.addConfig(config);
        return "added config";
    }

    @PutMapping("/bots")
    public String updateBot(@RequestBody BotModel bot) {
        gen.updateBot(bot);
        return "updated bot";
    }

    @PutMapping("/configs")
    public String updateConfig(@RequestBody ConfigModel config) {
        gen.updateConfig(config);
        return "updated config";
    }

    @DeleteMapping("/bots/{name}")
    public String deleteBot(@PathVariable String name) {
        gen.deleteBot(name);
        return "deleted bot";
    }

    @DeleteMapping("/configs/{name}")
    public String deleteAllBotConfig(@PathVariable String name) {
        gen.deleteAllBotConfig(name);
        return "deleted all config for botname";
    }

    @DeleteMapping("/configs/{name}/{key}")
    public String deleteConfig(@PathVariable String name, @PathVariable String key) {
        gen.deleteConfig(name, key);
        return "deleted config for botname";
    }
}