/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ggrpg3;

/**
 *
 * @author fifa
 */
public class ReadMeToUnderstand {
    /*
    
    As of now, 13/12/2018 8:23PM, this program ggrpg3
    has the main folder (ggrpg3 itself), and 6 sub-folders
    (display, gfx, hannah, states, tiles and worlds).
    
    The main folder, ggrpg3 has four main programs:
    1. Game
    (For game loop. As long as this loop continues, this game runs.
    This program takes a lot from other classes: it takes WASD,
    it takes the JFrame window, it takes the tiles' database,
    basically it's the backbone.)
    
    2. Launcher
    (To launch game with initialized title and size.)
    
    3. KeyManager
    (WASD initialized.)
    
    4. GetEverything
    (It takes the value of everything literally. The game loop,
    the world, the tiles.. this one is so that it's easy to
    get the value of anything across all classes.)
    
    ------------------------------------------------------
    
    The sub-folders:
    1. Display
    (JFrame generator.)
    
    2. Gfx
    (ImageLoader - the tileset chosen.
    SpriteSheet - a class to crop the tileset into chosen tiles.
    Assets - initializing the cropped tilesets into names like
    grasses, stones, wall etc.)
    
    3. Hannah
    (I was too lazy to give it a name, so Hannah it is.
    Enemy - Combat output.
    Combat (extends Enemy) - Combat system algorithm.
    Entity - Main properties of entities (size, x/y-axis, boundaries)
    Creature (extends Entity) - Collision logic is here. Tak siap lagi :(
    Player (extends Creature) - WASD how many tile moved is here,
    initializes its own boundaries & size, a tester for collision
    
    4. States
    (
    
    
    
    
    
    
    
    
    
    */
}
