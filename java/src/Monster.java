//package adventure

public class Monster{
	private int patk, pdef, matk, mdef, max_hp, max_mp, cur_hp, cur_mp, spd;
	private int hp_dec = 0, mp_dec = 0, level;
	private int bonus_str = 0, bonus_con = 0, bonus_intel = 0, bonus_wis = 0, bonus_agi = 0;
	private int bonus_patk = 0, bonus_pdef = 0, bonus_matk = 0, bonus_mdef = 0, bonus_hp = 0, bonus_mp = 0, bonus_spd = 0;

	public Monster(int lv, int pa, int pd, int ma, int md, int mhp, int mmp, int sp){
		this.level = lv;
		this.patk = pa;
		this.pdef = pd;
		this.matk = ma;
		this.mdef = md;
		this.spd = sp;
		this.max_hp = mhp;
		this.max_mp = mmp;
		this.cur_hp = mhp;
		this.cur_mp = mmp;
	}
	
	public void calc_stats(){
		this.patk = patk + bonus_patk;
		this.pdef = pdef + bonus_pdef;
		this.matk = matk + bonus_matk;
		this.mdef = mdef + bonus_mdef;
		this.spd = spd + bonus_spd;
		this.max_hp = max_hp + bonus_hp;
		this.max_mp = max_mp + bonus_mp;
		this.cur_hp = max_hp - hp_dec + bonus_hp;
		this.cur_mp = max_mp - mp_dec + bonus_mp;
	}
	
	//temporary stats increments for equipments and buffs
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
	
	//Setter
	public void set_level(int x){
		this.level = x;
	}
	
	public void set_patk(int x){
		this.patk = x;
	}
	
	public void set_pdef(int x){
		this.pdef = x;
	}
	
	public void set_matk(int x){
		this.matk = x;
	}
	
	public void set_mdef(int x){
		this.mdef = x;
	}
	
	public void set_spd(int x){
		this.spd = x;
	}
	
	public void set_max_hp(int x){
		this.max_hp = x;
	}
	
	public void set_max_mp(int x){
		this.max_mp = x;
	}
	
	//Getter
	public int get_level(){
		return this.level;
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
		System.out.println("Monster status: ");
		System.out.println("LEVEL: " + this.level);
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