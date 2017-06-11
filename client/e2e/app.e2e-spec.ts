import { ClientPage } from './app.po';
import { browser } from 'protractor';

describe('client App', () => {
  let page: ClientPage;

  beforeEach(() => {
    page = new ClientPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });

  it('should have beer list', () => {
    page.navigateTo();
    expect(page.getBeerListTitle()).toEqual('Beer List');
    // don't verify list because protractor runs on random port
    // and I don't want to change Spring Boot to accept origin="*"
    // because then it won't match the blog post instructions
  });
});
