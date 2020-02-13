

public class Player{
	private int str = 1, con = 1, intel = 1, wis = 1, agi = 1;
	private int patk, pdef, matk, mdef, max_hp, max_mp, cur_hp, cur_mp, spd;
	private int hp_dec = 0, mp_dec = 0, level = 1, exp = 0;
	private int bonus_str = 0, bonus_con = 0, bonus_intel = 0, bonus_wis = 0, bonus_agi = 0;
	private int bonus_patk = 0, bonus_pdef = 0, bonus_matk = 0, bonus_mdef = 0, bonus_hp = 0, bonus_mp = 0, bonus_spd = 0;
	//Job job = new Job();
	
	public Player(){
	}
	
	public Player(int lv){
		this.level = lv;
	}
	
	public Player(int lv, int st, int co, int in, int wi, int ag){
		this.level = lv;
		this.str = st;
		this.con = co;
		this.intel = in;
		this.wis = wi;
		this.agi = ag;
	}
	
	//stats calculations
	public void calc_stats(){
		this.str = str + bonus_str;
		this.con = con + bonus_con;
		this.intel = intel + bonus_intel;
		this.wis = wis + bonus_wis;
		this.agi = agi + bonus_agi;
		this.patk = str * 2 + level + bonus_patk;
		this.pdef = con + level * 3 + bonus_pdef;
		this.matk = intel * 2 + level * 2 + bonus_matk;
		this.mdef = wis + level * 3 + bonus_mdef;
		this.spd = agi + level + bonus_spd;
		this.max_hp = con * 5 + level * 2 + bonus_hp;
		this.max_mp = wis * 3 + bonus_mp;
		this.cur_hp = max_hp - hp_dec + bonus_hp;
		this.cur_mp = max_mp - mp_dec + bonus_mp;
	}
	
	//temporary stats increments for equipments and buffs
	public void levelUp(){
		this.level++;
	}
	
	public void gainExp(int ex){
		this.exp += ex;
	}
	
	public void inc_str(int a){
		this.bonus_str += a;
	}
	
	public void inc_con(int a){
		this.bonus_con += a;
	}
	
	public void inc_int(int a){
		this.bonus_intel += a;
	}
	
	public void inc_wis(int a){
		this.bonus_wis += a;
	}
	
	public void inc_agi(int a){
		this.bonus_agi += a;
	}
	
	public void inc_patk(int a){
		this.bonus_patk += a;
	}
	
	public void inc_pdef(int a){
		this.bonus_pdef += a;
	}
	
	public void inc_matk(int a){
		this.bonus_matk += a;
	}
	
	public void inc_mdef(int a){
		this.bonus_mdef += a;
	}
	
	public void inc_spd(int a){
		this.bonus_spd += a;
	}
	
	public void inc_hp(int a){
		this.bonus_hp += a;
	}
	
	public void inc_mp(int a){
		this.bonus_mp += a;
	}
	
	public void rec_hp(int a){
		if(this.hp_dec >= a){
			this.hp_dec -= a;
		}else{
			this.hp_dec = 0;
		}
	}
	
	public void rec_mp(int a){
		if(this.mp_dec >= a){
			this.mp_dec -= a;
		}else{
			this.mp_dec = 0;
		}
	}
	
	//setters
	
	/*
	public void setJob(Job x){
		this.job = x;
	}
	*/
	
	public void set_level(int x){
		this.level = x;
	}
	
	public void set_exp(int x){
		this.exp = x;
	}
	
	public void set_str(int x){
		this.str = x;
	}
	
	public void set_con(int x){
		this.con = x;
	}
	
	public void set_intel(int x){
		this.intel = x;
	}
	
	public void set_wis(int x){
		this.wis = x;
	}
	
	public void set_agi(int x){
		this.agi = x;
	}
	
	/***************************
	*	Getters
	***************************/
	public int get_level(){
		return this.level;
	}
	
	public int get_str(){
		return this.str;
	}
	
	public int get_con(){
		return this.con;
	}
	
	public int get_intel(){
		return this.intel;
	}
	
	public int get_wis(){
		return this.wis;
	}
	
	public int get_agi(){
		return this.agi;
	}
	
	public int get_patk(){
		return this.patk;
	}
	
	public int get_pdef(){
		return this.pdef;
	}
	
	public int get_matk(){
		return this.matk;
	}
	
	public int get_mdef(){
		return this.mdef;
	}
	
	public int get_spd(){
		return this.spd;
	}
	
	public int get_cur_hp(){
		return this.cur_hp;
	}
	
	public int get_cur_mp(){
		return this.cur_mp;
	}
	
	public int get_max_hp(){
		return this.max_hp;
	}
	
	public int get_max_mp(){
		return this.max_mp;
	}
	
	/***********************
	*test print
	***********************/
	public void display_stats(){
		System.out.println("Character status: ");
		System.out.println("LEVEL: " + this.level);
		System.out.println("EXP: " + this.exp);
		System.out.println("STR: " + this.str);
		System.out.println("CON: " + this.con);
		System.out.println("INT: " + this.intel);
		System.out.println("WIS: " + this.wis);
		System.out.println("AGI: " + this.agi);
		System.out.println("HP: " + this.cur_hp);
		System.out.println("MP: " + this.cur_mp);
		System.out.println("MAXHP: " + this.max_hp);
		System.out.println("MAXMP: " + this.max_mp);
		System.out.println("PATK: " + this.patk);
		System.out.println("PDEF: " + this.pdef);
		System.out.println("MATK: " + this.matk);
		System.out.println("MDEF: " + this.mdef);
		System.out.println("SPD: " + this.spd);
	}
}