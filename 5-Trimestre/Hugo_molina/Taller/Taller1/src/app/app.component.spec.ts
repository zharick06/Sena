import { TestBed } from '@angular/core/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { AppComponent } from './app.component';

describe('AppComponent', () => {
  let component:AppComponent;
  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [
        RouterTestingModule
      ],
      declarations: [
        AppComponent
      ],
    }).compileComponents();
    component= new AppComponent()
  });

  /* it('should create the app', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app).toBeTruthy();
  });

  it(`should have as title 'Taller1'`, () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app.title).toEqual('Taller1');
  });

  it('should render title', () => {
    const fixture = TestBed.createComponent(AppComponent);
    fixture.detectChanges();
    const compiled = fixture.nativeElement as HTMLElement;
    expect(compiled.querySelector('.content span')?.textContent).toContain('Taller1 app is running!');
  }); */

  it('La variable title debe contener el nombre del proyecto', ()=>{
    let myvar:string=component.title;
    expect(myvar).toEqual('Taller1')
  })
  it('La variable siempre debe estar en False',()=>{
    let mycvar:boolean= component.active
    expect(mycvar).toBeFalsy()
  })
  it('El metodo sum() debe retornar la suma de dos numeros enviados',()=>{
    let a:number=5;
    let b: number=10;
    let result:number=a+b;

    expect(component.sum(a,b)).toBe(result);
    })
  it("Debe existir un metodo llamado sum()",()=>{
    let metodollamado=spyOn(component,'sum')
    component.sum(3,8);
    expect(metodollamado).toHaveBeenCalled();
  })

});
